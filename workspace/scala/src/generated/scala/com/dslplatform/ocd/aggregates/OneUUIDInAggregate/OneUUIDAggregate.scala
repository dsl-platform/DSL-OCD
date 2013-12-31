package com.dslplatform.ocd.aggregates.OneUUIDInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneUUIDAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneUUID: java.util.UUID
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneUUIDInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneUUIDAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneUUIDAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneUUIDInAggregate.OneUUIDAggregate): this.type = {
    this.URI = result.URI;
    this._oneUUID = result._oneUUID;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneUUIDInAggregate.OneUUIDAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneUUID")
  def oneUUID = {
    _oneUUID
  }

  def oneUUID_= (value: java.util.UUID) {
    _oneUUID = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneUUID") oneUUID: java.util.UUID
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneUUID = if (oneUUID == null) java.util.UUID.randomUUID else oneUUID)

}

object OneUUIDAggregate extends AggregateRootCompanion[OneUUIDAggregate]{

  def apply(
    oneUUID: java.util.UUID = java.util.UUID.randomUUID
  ) = {
    new OneUUIDAggregate(
      _locator = None
    , _URI = null
    , _oneUUID = oneUUID)
  }

}
