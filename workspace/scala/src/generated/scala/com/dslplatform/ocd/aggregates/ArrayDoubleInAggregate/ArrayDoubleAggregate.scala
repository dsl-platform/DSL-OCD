package com.dslplatform.ocd.aggregates.ArrayDoubleInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayDoubleAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayDouble: Array[Double]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayDoubleInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayDoubleAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayDoubleAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayDoubleInAggregate.ArrayDoubleAggregate): this.type = {
    this.URI = result.URI;
    this._arrayDouble = result._arrayDouble;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayDoubleInAggregate.ArrayDoubleAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayDouble")
  def arrayDouble = {
    _arrayDouble
  }

  def arrayDouble_= (value: Array[Double]) {
    _arrayDouble = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayDouble") arrayDouble: Array[Double]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayDouble = if (arrayDouble == null) Array.empty else arrayDouble)

}

object ArrayDoubleAggregate extends AggregateRootCompanion[ArrayDoubleAggregate]{

  def apply(
    arrayDouble: Array[Double] = Array.empty
  ) = {
    new ArrayDoubleAggregate(
      _locator = None
    , _URI = null
    , _arrayDouble = arrayDouble)
  }

}
