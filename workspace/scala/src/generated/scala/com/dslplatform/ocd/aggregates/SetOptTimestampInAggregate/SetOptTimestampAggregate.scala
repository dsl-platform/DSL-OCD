package com.dslplatform.ocd.aggregates.SetOptTimestampInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetOptTimestampAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setOptTimestamp: Set[Option[org.joda.time.DateTime]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetOptTimestampInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetOptTimestampAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetOptTimestampAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetOptTimestampInAggregate.SetOptTimestampAggregate): this.type = {
    this.URI = result.URI;
    this._setOptTimestamp = result._setOptTimestamp;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetOptTimestampInAggregate.SetOptTimestampAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setOptTimestamp")
  def setOptTimestamp = {
    _setOptTimestamp
  }

  def setOptTimestamp_= (value: Set[Option[org.joda.time.DateTime]]) {
    _setOptTimestamp = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setOptTimestamp") setOptTimestamp: Set[Option[org.joda.time.DateTime]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setOptTimestamp = if (setOptTimestamp == null) Set.empty else setOptTimestamp)

}

object SetOptTimestampAggregate extends AggregateRootCompanion[SetOptTimestampAggregate]{

  def apply(
    setOptTimestamp: Set[Option[org.joda.time.DateTime]] = Set.empty
  ) = {
    new SetOptTimestampAggregate(
      _locator = None
    , _URI = null
    , _setOptTimestamp = setOptTimestamp)
  }

}
