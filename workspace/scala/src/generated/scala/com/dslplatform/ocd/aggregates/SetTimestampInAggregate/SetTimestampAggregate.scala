package com.dslplatform.ocd.aggregates.SetTimestampInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetTimestampAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setTimestamp: Set[org.joda.time.DateTime]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetTimestampInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetTimestampAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetTimestampAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetTimestampInAggregate.SetTimestampAggregate): this.type = {
    this.URI = result.URI;
    this._setTimestamp = result._setTimestamp;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetTimestampInAggregate.SetTimestampAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setTimestamp")
  def setTimestamp = {
    _setTimestamp
  }

  def setTimestamp_= (value: Set[org.joda.time.DateTime]) {
    _setTimestamp = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setTimestamp") setTimestamp: Set[org.joda.time.DateTime]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setTimestamp = if (setTimestamp == null) Set.empty else setTimestamp)

}

object SetTimestampAggregate extends AggregateRootCompanion[SetTimestampAggregate]{

  def apply(
    setTimestamp: Set[org.joda.time.DateTime] = Set.empty
  ) = {
    new SetTimestampAggregate(
      _locator = None
    , _URI = null
    , _setTimestamp = setTimestamp)
  }

}
