package com.dslplatform.ocd.aggregates.ListMapInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListMapAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listMap: IndexedSeq[Map[String, String]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListMapInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListMapAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListMapAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListMapInAggregate.ListMapAggregate): this.type = {
    this.URI = result.URI;
    this._listMap = result._listMap;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListMapInAggregate.ListMapAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listMap")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listMap = {
    _listMap
  }

  def listMap_= (value: IndexedSeq[Map[String, String]]) {
    _listMap = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listMap") listMap: IndexedSeq[Map[String, String]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listMap = if (listMap == null) IndexedSeq.empty else listMap)

}

object ListMapAggregate extends AggregateRootCompanion[ListMapAggregate]{

  def apply(
    listMap: IndexedSeq[Map[String, String]] = IndexedSeq[Map[String, String]]()
  ) = {
    new ListMapAggregate(
      _locator = None
    , _URI = null
    , _listMap = listMap)
  }

}
