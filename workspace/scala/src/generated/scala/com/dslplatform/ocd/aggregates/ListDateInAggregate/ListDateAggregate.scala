package com.dslplatform.ocd.aggregates.ListDateInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListDateAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listDate: IndexedSeq[org.joda.time.LocalDate]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListDateInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListDateAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListDateAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListDateInAggregate.ListDateAggregate): this.type = {
    this.URI = result.URI;
    this._listDate = result._listDate;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListDateInAggregate.ListDateAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listDate")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listDate = {
    _listDate
  }

  def listDate_= (value: IndexedSeq[org.joda.time.LocalDate]) {
    _listDate = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listDate") listDate: IndexedSeq[org.joda.time.LocalDate]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listDate = if (listDate == null) IndexedSeq.empty else listDate)

}

object ListDateAggregate extends AggregateRootCompanion[ListDateAggregate]{

  def apply(
    listDate: IndexedSeq[org.joda.time.LocalDate] = IndexedSeq[org.joda.time.LocalDate]()
  ) = {
    new ListDateAggregate(
      _locator = None
    , _URI = null
    , _listDate = listDate)
  }

}
