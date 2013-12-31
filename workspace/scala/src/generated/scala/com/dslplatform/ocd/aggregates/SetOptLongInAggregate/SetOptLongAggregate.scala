package com.dslplatform.ocd.aggregates.SetOptLongInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetOptLongAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setOptLong: Set[Option[Long]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetOptLongInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetOptLongAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetOptLongAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetOptLongInAggregate.SetOptLongAggregate): this.type = {
    this.URI = result.URI;
    this._setOptLong = result._setOptLong;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetOptLongInAggregate.SetOptLongAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setOptLong")
  def setOptLong = {
    _setOptLong
  }

  def setOptLong_= (value: Set[Option[Long]]) {
    _setOptLong = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setOptLong") setOptLong: Set[Option[Long]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setOptLong = if (setOptLong == null) Set.empty else setOptLong)

}

object SetOptLongAggregate extends AggregateRootCompanion[SetOptLongAggregate]{

  def apply(
    setOptLong: Set[Option[Long]] = Set.empty
  ) = {
    new SetOptLongAggregate(
      _locator = None
    , _URI = null
    , _setOptLong = setOptLong)
  }

}
