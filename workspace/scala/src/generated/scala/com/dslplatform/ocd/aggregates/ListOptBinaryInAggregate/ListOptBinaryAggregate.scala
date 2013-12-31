package com.dslplatform.ocd.aggregates.ListOptBinaryInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptBinaryAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptBinary: IndexedSeq[Option[Array[Byte]]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptBinaryInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptBinaryAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptBinaryAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptBinaryInAggregate.ListOptBinaryAggregate): this.type = {
    this.URI = result.URI;
    this._listOptBinary = result._listOptBinary;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptBinaryInAggregate.ListOptBinaryAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptBinary")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptBinary = {
    _listOptBinary
  }

  def listOptBinary_= (value: IndexedSeq[Option[Array[Byte]]]) {
    _listOptBinary = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptBinary") listOptBinary: IndexedSeq[Option[Array[Byte]]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptBinary = if (listOptBinary == null) IndexedSeq.empty else listOptBinary)

}

object ListOptBinaryAggregate extends AggregateRootCompanion[ListOptBinaryAggregate]{

  def apply(
    listOptBinary: IndexedSeq[Option[Array[Byte]]] = IndexedSeq[Option[Array[Byte]]]()
  ) = {
    new ListOptBinaryAggregate(
      _locator = None
    , _URI = null
    , _listOptBinary = listOptBinary)
  }

}
