package com.dslplatform.ocd.aggregates.SetLongInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetLongAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setLong: Set[Long]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetLongInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetLongAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetLongAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetLongInAggregate.SetLongAggregate): this.type = {
    this.URI = result.URI;
    this._setLong = result._setLong;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetLongInAggregate.SetLongAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setLong")
  def setLong = {
    _setLong
  }

  def setLong_= (value: Set[Long]) {
    _setLong = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setLong") setLong: Set[Long]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setLong = if (setLong == null) Set.empty else setLong)

}

object SetLongAggregate extends AggregateRootCompanion[SetLongAggregate]{

  def apply(
    setLong: Set[Long] = Set.empty
  ) = {
    new SetLongAggregate(
      _locator = None
    , _URI = null
    , _setLong = setLong)
  }

}
