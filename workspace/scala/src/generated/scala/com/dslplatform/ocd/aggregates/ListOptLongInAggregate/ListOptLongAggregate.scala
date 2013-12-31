package com.dslplatform.ocd.aggregates.ListOptLongInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptLongAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptLong: IndexedSeq[Option[Long]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptLongInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptLongAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptLongAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptLongInAggregate.ListOptLongAggregate): this.type = {
    this.URI = result.URI;
    this._listOptLong = result._listOptLong;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptLongInAggregate.ListOptLongAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptLong")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptLong = {
    _listOptLong
  }

  def listOptLong_= (value: IndexedSeq[Option[Long]]) {
    _listOptLong = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptLong") listOptLong: IndexedSeq[Option[Long]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptLong = if (listOptLong == null) IndexedSeq.empty else listOptLong)

}

object ListOptLongAggregate extends AggregateRootCompanion[ListOptLongAggregate]{

  def apply(
    listOptLong: IndexedSeq[Option[Long]] = IndexedSeq[Option[Long]]()
  ) = {
    new ListOptLongAggregate(
      _locator = None
    , _URI = null
    , _listOptLong = listOptLong)
  }

}
