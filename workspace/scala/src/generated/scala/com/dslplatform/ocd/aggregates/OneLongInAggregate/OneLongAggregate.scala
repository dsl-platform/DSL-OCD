package com.dslplatform.ocd.aggregates.OneLongInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneLongAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneLong: Long
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneLongInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneLongAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneLongAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneLongInAggregate.OneLongAggregate): this.type = {
    this.URI = result.URI;
    this._oneLong = result._oneLong;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneLongInAggregate.OneLongAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneLong")
  def oneLong = {
    _oneLong
  }

  def oneLong_= (value: Long) {
    _oneLong = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneLong") oneLong: Long
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneLong = if (oneLong == null) 0 else oneLong)

}

object OneLongAggregate extends AggregateRootCompanion[OneLongAggregate]{

  def apply(
    oneLong: Long = 0
  ) = {
    new OneLongAggregate(
      _locator = None
    , _URI = null
    , _oneLong = oneLong)
  }

}
