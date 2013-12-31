package com.dslplatform.ocd.aggregates.ListUUIDInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListUUIDAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listUUID: IndexedSeq[java.util.UUID]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListUUIDInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListUUIDAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListUUIDAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListUUIDInAggregate.ListUUIDAggregate): this.type = {
    this.URI = result.URI;
    this._listUUID = result._listUUID;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListUUIDInAggregate.ListUUIDAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listUUID")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listUUID = {
    _listUUID
  }

  def listUUID_= (value: IndexedSeq[java.util.UUID]) {
    _listUUID = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listUUID") listUUID: IndexedSeq[java.util.UUID]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listUUID = if (listUUID == null) IndexedSeq.empty else listUUID)

}

object ListUUIDAggregate extends AggregateRootCompanion[ListUUIDAggregate]{

  def apply(
    listUUID: IndexedSeq[java.util.UUID] = IndexedSeq[java.util.UUID]()
  ) = {
    new ListUUIDAggregate(
      _locator = None
    , _URI = null
    , _listUUID = listUUID)
  }

}
