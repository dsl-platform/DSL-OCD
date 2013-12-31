package com.dslplatform.ocd.aggregates.ArrayDateInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayDateAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayDate: Array[org.joda.time.LocalDate]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayDateInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayDateAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayDateAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayDateInAggregate.ArrayDateAggregate): this.type = {
    this.URI = result.URI;
    this._arrayDate = result._arrayDate;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayDateInAggregate.ArrayDateAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayDate")
  def arrayDate = {
    _arrayDate
  }

  def arrayDate_= (value: Array[org.joda.time.LocalDate]) {
    _arrayDate = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayDate") arrayDate: Array[org.joda.time.LocalDate]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayDate = if (arrayDate == null) Array.empty else arrayDate)

}

object ArrayDateAggregate extends AggregateRootCompanion[ArrayDateAggregate]{

  def apply(
    arrayDate: Array[org.joda.time.LocalDate] = Array.empty
  ) = {
    new ArrayDateAggregate(
      _locator = None
    , _URI = null
    , _arrayDate = arrayDate)
  }

}
