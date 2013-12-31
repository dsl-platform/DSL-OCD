package com.dslplatform.ocd.aggregates.ArrayUUIDInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayUUIDAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayUUID: Array[java.util.UUID]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayUUIDInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayUUIDAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayUUIDAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayUUIDInAggregate.ArrayUUIDAggregate): this.type = {
    this.URI = result.URI;
    this._arrayUUID = result._arrayUUID;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayUUIDInAggregate.ArrayUUIDAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayUUID")
  def arrayUUID = {
    _arrayUUID
  }

  def arrayUUID_= (value: Array[java.util.UUID]) {
    _arrayUUID = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayUUID") arrayUUID: Array[java.util.UUID]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayUUID = if (arrayUUID == null) Array.empty else arrayUUID)

}

object ArrayUUIDAggregate extends AggregateRootCompanion[ArrayUUIDAggregate]{

  def apply(
    arrayUUID: Array[java.util.UUID] = Array.empty
  ) = {
    new ArrayUUIDAggregate(
      _locator = None
    , _URI = null
    , _arrayUUID = arrayUUID)
  }

}
