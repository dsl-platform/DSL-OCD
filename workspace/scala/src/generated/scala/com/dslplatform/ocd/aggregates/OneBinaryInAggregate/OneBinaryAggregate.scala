package com.dslplatform.ocd.aggregates.OneBinaryInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneBinaryAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneBinary: Array[Byte]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneBinaryInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneBinaryAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneBinaryAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneBinaryInAggregate.OneBinaryAggregate): this.type = {
    this.URI = result.URI;
    this._oneBinary = result._oneBinary;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneBinaryInAggregate.OneBinaryAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneBinary")
  def oneBinary = {
    _oneBinary
  }

  def oneBinary_= (value: Array[Byte]) {
    _oneBinary = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneBinary") oneBinary: Array[Byte]
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneBinary = if (oneBinary == null) Array[Byte]() else oneBinary)

}

object OneBinaryAggregate extends AggregateRootCompanion[OneBinaryAggregate]{

  def apply(
    oneBinary: Array[Byte] = Array[Byte]()
  ) = {
    new OneBinaryAggregate(
      _locator = None
    , _URI = null
    , _oneBinary = oneBinary)
  }

}
