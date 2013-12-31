package com.dslplatform.ocd.aggregates.OneBoolInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneBoolAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneBool: Boolean
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneBoolInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneBoolAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneBoolAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneBoolInAggregate.OneBoolAggregate): this.type = {
    this.URI = result.URI;
    this._oneBool = result._oneBool;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneBoolInAggregate.OneBoolAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneBool")
  def oneBool = {
    _oneBool
  }

  def oneBool_= (value: Boolean) {
    _oneBool = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneBool") oneBool: Boolean
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneBool = if (oneBool == null) false else oneBool)

}

object OneBoolAggregate extends AggregateRootCompanion[OneBoolAggregate]{

  def apply(
    oneBool: Boolean = false
  ) = {
    new OneBoolAggregate(
      _locator = None
    , _URI = null
    , _oneBool = oneBool)
  }

}
