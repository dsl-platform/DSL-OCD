package com.dslplatform.ocd.aggregates.ListBoolInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListBoolAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listBool: IndexedSeq[Boolean]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListBoolInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListBoolAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListBoolAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListBoolInAggregate.ListBoolAggregate): this.type = {
    this.URI = result.URI;
    this._listBool = result._listBool;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListBoolInAggregate.ListBoolAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listBool")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listBool = {
    _listBool
  }

  def listBool_= (value: IndexedSeq[Boolean]) {
    _listBool = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listBool") listBool: IndexedSeq[Boolean]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listBool = if (listBool == null) IndexedSeq.empty else listBool)

}

object ListBoolAggregate extends AggregateRootCompanion[ListBoolAggregate]{

  def apply(
    listBool: IndexedSeq[Boolean] = IndexedSeq[Boolean]()
  ) = {
    new ListBoolAggregate(
      _locator = None
    , _URI = null
    , _listBool = listBool)
  }

}
