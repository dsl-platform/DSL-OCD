package com.dslplatform.ocd.aggregates.ArrayFloatInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayFloatAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayFloat: Array[Float]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayFloatInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayFloatAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayFloatAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayFloatInAggregate.ArrayFloatAggregate): this.type = {
    this.URI = result.URI;
    this._arrayFloat = result._arrayFloat;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayFloatInAggregate.ArrayFloatAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayFloat")
  def arrayFloat = {
    _arrayFloat
  }

  def arrayFloat_= (value: Array[Float]) {
    _arrayFloat = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayFloat") arrayFloat: Array[Float]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayFloat = if (arrayFloat == null) Array.empty else arrayFloat)

}

object ArrayFloatAggregate extends AggregateRootCompanion[ArrayFloatAggregate]{

  def apply(
    arrayFloat: Array[Float] = Array.empty
  ) = {
    new ArrayFloatAggregate(
      _locator = None
    , _URI = null
    , _arrayFloat = arrayFloat)
  }

}
