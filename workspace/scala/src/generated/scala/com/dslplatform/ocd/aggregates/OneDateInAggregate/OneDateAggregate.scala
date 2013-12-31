package com.dslplatform.ocd.aggregates.OneDateInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneDateAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneDate: org.joda.time.LocalDate
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneDateInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneDateAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneDateAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneDateInAggregate.OneDateAggregate): this.type = {
    this.URI = result.URI;
    this._oneDate = result._oneDate;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneDateInAggregate.OneDateAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneDate")
  def oneDate = {
    _oneDate
  }

  def oneDate_= (value: org.joda.time.LocalDate) {
    _oneDate = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneDate") oneDate: org.joda.time.LocalDate
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneDate = if (oneDate == null) org.joda.time.LocalDate.now else oneDate)

}

object OneDateAggregate extends AggregateRootCompanion[OneDateAggregate]{

  def apply(
    oneDate: org.joda.time.LocalDate = org.joda.time.LocalDate.now
  ) = {
    new OneDateAggregate(
      _locator = None
    , _URI = null
    , _oneDate = oneDate)
  }

}
