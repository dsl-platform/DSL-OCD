package com.dslplatform.ocd.aggregates.ListLongInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListLongAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listLong: IndexedSeq[Long]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListLongInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListLongAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListLongAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListLongInAggregate.ListLongAggregate): this.type = {
    this.URI = result.URI;
    this._listLong = result._listLong;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListLongInAggregate.ListLongAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listLong")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listLong = {
    _listLong
  }

  def listLong_= (value: IndexedSeq[Long]) {
    _listLong = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listLong") listLong: IndexedSeq[Long]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listLong = if (listLong == null) IndexedSeq.empty else listLong)

}

object ListLongAggregate extends AggregateRootCompanion[ListLongAggregate]{

  def apply(
    listLong: IndexedSeq[Long] = IndexedSeq[Long]()
  ) = {
    new ListLongAggregate(
      _locator = None
    , _URI = null
    , _listLong = listLong)
  }

}
