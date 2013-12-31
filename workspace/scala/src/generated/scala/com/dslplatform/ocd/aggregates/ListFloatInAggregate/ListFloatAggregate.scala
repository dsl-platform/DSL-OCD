package com.dslplatform.ocd.aggregates.ListFloatInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListFloatAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listFloat: IndexedSeq[Float]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListFloatInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListFloatAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListFloatAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListFloatInAggregate.ListFloatAggregate): this.type = {
    this.URI = result.URI;
    this._listFloat = result._listFloat;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListFloatInAggregate.ListFloatAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listFloat")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listFloat = {
    _listFloat
  }

  def listFloat_= (value: IndexedSeq[Float]) {
    _listFloat = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listFloat") listFloat: IndexedSeq[Float]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listFloat = if (listFloat == null) IndexedSeq.empty else listFloat)

}

object ListFloatAggregate extends AggregateRootCompanion[ListFloatAggregate]{

  def apply(
    listFloat: IndexedSeq[Float] = IndexedSeq[Float]()
  ) = {
    new ListFloatAggregate(
      _locator = None
    , _URI = null
    , _listFloat = listFloat)
  }

}
