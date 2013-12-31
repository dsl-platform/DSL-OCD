package com.dslplatform.ocd.aggregates.OneTimestampInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneTimestampAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneTimestamp: org.joda.time.DateTime
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneTimestampInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneTimestampAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneTimestampAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneTimestampInAggregate.OneTimestampAggregate): this.type = {
    this.URI = result.URI;
    this._oneTimestamp = result._oneTimestamp;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneTimestampInAggregate.OneTimestampAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneTimestamp")
  def oneTimestamp = {
    _oneTimestamp
  }

  def oneTimestamp_= (value: org.joda.time.DateTime) {
    _oneTimestamp = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneTimestamp") oneTimestamp: org.joda.time.DateTime
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneTimestamp = if (oneTimestamp == null) org.joda.time.DateTime.now else oneTimestamp)

}

object OneTimestampAggregate extends AggregateRootCompanion[OneTimestampAggregate]{

  def apply(
    oneTimestamp: org.joda.time.DateTime = org.joda.time.DateTime.now
  ) = {
    new OneTimestampAggregate(
      _locator = None
    , _URI = null
    , _oneTimestamp = oneTimestamp)
  }

}
