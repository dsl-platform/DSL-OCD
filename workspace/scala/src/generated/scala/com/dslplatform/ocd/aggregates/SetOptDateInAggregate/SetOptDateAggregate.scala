package com.dslplatform.ocd.aggregates.SetOptDateInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetOptDateAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setOptDate: Set[Option[org.joda.time.LocalDate]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetOptDateInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetOptDateAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetOptDateAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetOptDateInAggregate.SetOptDateAggregate): this.type = {
    this.URI = result.URI;
    this._setOptDate = result._setOptDate;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetOptDateInAggregate.SetOptDateAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setOptDate")
  def setOptDate = {
    _setOptDate
  }

  def setOptDate_= (value: Set[Option[org.joda.time.LocalDate]]) {
    _setOptDate = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setOptDate") setOptDate: Set[Option[org.joda.time.LocalDate]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setOptDate = if (setOptDate == null) Set.empty else setOptDate)

}

object SetOptDateAggregate extends AggregateRootCompanion[SetOptDateAggregate]{

  def apply(
    setOptDate: Set[Option[org.joda.time.LocalDate]] = Set.empty
  ) = {
    new SetOptDateAggregate(
      _locator = None
    , _URI = null
    , _setOptDate = setOptDate)
  }

}
