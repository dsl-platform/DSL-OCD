package com.dslplatform.ocd.aggregates.ListOptDateInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptDateAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptDate: IndexedSeq[Option[org.joda.time.LocalDate]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptDateInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptDateAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptDateAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptDateInAggregate.ListOptDateAggregate): this.type = {
    this.URI = result.URI;
    this._listOptDate = result._listOptDate;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptDateInAggregate.ListOptDateAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptDate")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptDate = {
    _listOptDate
  }

  def listOptDate_= (value: IndexedSeq[Option[org.joda.time.LocalDate]]) {
    _listOptDate = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptDate") listOptDate: IndexedSeq[Option[org.joda.time.LocalDate]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptDate = if (listOptDate == null) IndexedSeq.empty else listOptDate)

}

object ListOptDateAggregate extends AggregateRootCompanion[ListOptDateAggregate]{

  def apply(
    listOptDate: IndexedSeq[Option[org.joda.time.LocalDate]] = IndexedSeq[Option[org.joda.time.LocalDate]]()
  ) = {
    new ListOptDateAggregate(
      _locator = None
    , _URI = null
    , _listOptDate = listOptDate)
  }

}
