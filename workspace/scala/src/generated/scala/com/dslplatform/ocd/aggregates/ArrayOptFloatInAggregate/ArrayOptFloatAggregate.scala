package com.dslplatform.ocd.aggregates.ArrayOptFloatInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptFloatAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptFloat: Array[Option[Float]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptFloatInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptFloatAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptFloatAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptFloatInAggregate.ArrayOptFloatAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptFloat = result._arrayOptFloat;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptFloatInAggregate.ArrayOptFloatAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptFloat")
  def arrayOptFloat = {
    _arrayOptFloat
  }

  def arrayOptFloat_= (value: Array[Option[Float]]) {
    _arrayOptFloat = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptFloat") arrayOptFloat: Array[Option[Float]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptFloat = if (arrayOptFloat == null) Array.empty else arrayOptFloat)

}

object ArrayOptFloatAggregate extends AggregateRootCompanion[ArrayOptFloatAggregate]{

  def apply(
    arrayOptFloat: Array[Option[Float]] = Array.empty
  ) = {
    new ArrayOptFloatAggregate(
      _locator = None
    , _URI = null
    , _arrayOptFloat = arrayOptFloat)
  }

}
