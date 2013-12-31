package com.dslplatform.ocd.aggregates.ListOptFloatInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptFloatAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptFloat: IndexedSeq[Option[Float]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptFloatInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptFloatAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptFloatAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptFloatInAggregate.ListOptFloatAggregate): this.type = {
    this.URI = result.URI;
    this._listOptFloat = result._listOptFloat;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptFloatInAggregate.ListOptFloatAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptFloat")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptFloat = {
    _listOptFloat
  }

  def listOptFloat_= (value: IndexedSeq[Option[Float]]) {
    _listOptFloat = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptFloat") listOptFloat: IndexedSeq[Option[Float]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptFloat = if (listOptFloat == null) IndexedSeq.empty else listOptFloat)

}

object ListOptFloatAggregate extends AggregateRootCompanion[ListOptFloatAggregate]{

  def apply(
    listOptFloat: IndexedSeq[Option[Float]] = IndexedSeq[Option[Float]]()
  ) = {
    new ListOptFloatAggregate(
      _locator = None
    , _URI = null
    , _listOptFloat = listOptFloat)
  }

}
