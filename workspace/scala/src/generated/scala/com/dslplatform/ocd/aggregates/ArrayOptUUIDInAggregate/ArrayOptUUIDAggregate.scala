package com.dslplatform.ocd.aggregates.ArrayOptUUIDInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptUUIDAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptUUID: Array[Option[java.util.UUID]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptUUIDInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptUUIDAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptUUIDAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptUUIDInAggregate.ArrayOptUUIDAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptUUID = result._arrayOptUUID;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptUUIDInAggregate.ArrayOptUUIDAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptUUID")
  def arrayOptUUID = {
    _arrayOptUUID
  }

  def arrayOptUUID_= (value: Array[Option[java.util.UUID]]) {
    _arrayOptUUID = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptUUID") arrayOptUUID: Array[Option[java.util.UUID]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptUUID = if (arrayOptUUID == null) Array.empty else arrayOptUUID)

}

object ArrayOptUUIDAggregate extends AggregateRootCompanion[ArrayOptUUIDAggregate]{

  def apply(
    arrayOptUUID: Array[Option[java.util.UUID]] = Array.empty
  ) = {
    new ArrayOptUUIDAggregate(
      _locator = None
    , _URI = null
    , _arrayOptUUID = arrayOptUUID)
  }

}
