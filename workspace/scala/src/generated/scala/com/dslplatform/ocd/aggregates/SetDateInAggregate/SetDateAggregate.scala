package com.dslplatform.ocd.aggregates.SetDateInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetDateAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setDate: Set[org.joda.time.LocalDate]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetDateInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetDateAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetDateAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetDateInAggregate.SetDateAggregate): this.type = {
    this.URI = result.URI;
    this._setDate = result._setDate;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetDateInAggregate.SetDateAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setDate")
  def setDate = {
    _setDate
  }

  def setDate_= (value: Set[org.joda.time.LocalDate]) {
    _setDate = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setDate") setDate: Set[org.joda.time.LocalDate]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setDate = if (setDate == null) Set.empty else setDate)

}

object SetDateAggregate extends AggregateRootCompanion[SetDateAggregate]{

  def apply(
    setDate: Set[org.joda.time.LocalDate] = Set.empty
  ) = {
    new SetDateAggregate(
      _locator = None
    , _URI = null
    , _setDate = setDate)
  }

}
