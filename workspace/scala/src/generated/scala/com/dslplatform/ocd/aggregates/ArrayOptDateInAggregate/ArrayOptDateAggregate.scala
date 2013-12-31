package com.dslplatform.ocd.aggregates.ArrayOptDateInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptDateAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptDate: Array[Option[org.joda.time.LocalDate]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptDateInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptDateAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptDateAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptDateInAggregate.ArrayOptDateAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptDate = result._arrayOptDate;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptDateInAggregate.ArrayOptDateAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptDate")
  def arrayOptDate = {
    _arrayOptDate
  }

  def arrayOptDate_= (value: Array[Option[org.joda.time.LocalDate]]) {
    _arrayOptDate = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptDate") arrayOptDate: Array[Option[org.joda.time.LocalDate]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptDate = if (arrayOptDate == null) Array.empty else arrayOptDate)

}

object ArrayOptDateAggregate extends AggregateRootCompanion[ArrayOptDateAggregate]{

  def apply(
    arrayOptDate: Array[Option[org.joda.time.LocalDate]] = Array.empty
  ) = {
    new ArrayOptDateAggregate(
      _locator = None
    , _URI = null
    , _arrayOptDate = arrayOptDate)
  }

}
