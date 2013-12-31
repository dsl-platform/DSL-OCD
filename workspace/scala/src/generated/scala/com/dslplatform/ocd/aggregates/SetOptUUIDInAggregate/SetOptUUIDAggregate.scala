package com.dslplatform.ocd.aggregates.SetOptUUIDInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetOptUUIDAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setOptUUID: Set[Option[java.util.UUID]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetOptUUIDInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetOptUUIDAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetOptUUIDAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetOptUUIDInAggregate.SetOptUUIDAggregate): this.type = {
    this.URI = result.URI;
    this._setOptUUID = result._setOptUUID;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetOptUUIDInAggregate.SetOptUUIDAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setOptUUID")
  def setOptUUID = {
    _setOptUUID
  }

  def setOptUUID_= (value: Set[Option[java.util.UUID]]) {
    _setOptUUID = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setOptUUID") setOptUUID: Set[Option[java.util.UUID]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setOptUUID = if (setOptUUID == null) Set.empty else setOptUUID)

}

object SetOptUUIDAggregate extends AggregateRootCompanion[SetOptUUIDAggregate]{

  def apply(
    setOptUUID: Set[Option[java.util.UUID]] = Set.empty
  ) = {
    new SetOptUUIDAggregate(
      _locator = None
    , _URI = null
    , _setOptUUID = setOptUUID)
  }

}
