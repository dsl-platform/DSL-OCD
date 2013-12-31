package com.dslplatform.ocd.aggregates.ListBinaryInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListBinaryAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listBinary: IndexedSeq[Array[Byte]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListBinaryInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListBinaryAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListBinaryAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListBinaryInAggregate.ListBinaryAggregate): this.type = {
    this.URI = result.URI;
    this._listBinary = result._listBinary;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListBinaryInAggregate.ListBinaryAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listBinary")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listBinary = {
    _listBinary
  }

  def listBinary_= (value: IndexedSeq[Array[Byte]]) {
    _listBinary = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listBinary") listBinary: IndexedSeq[Array[Byte]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listBinary = if (listBinary == null) IndexedSeq.empty else listBinary)

}

object ListBinaryAggregate extends AggregateRootCompanion[ListBinaryAggregate]{

  def apply(
    listBinary: IndexedSeq[Array[Byte]] = IndexedSeq[Array[Byte]]()
  ) = {
    new ListBinaryAggregate(
      _locator = None
    , _URI = null
    , _listBinary = listBinary)
  }

}
