package com.dslplatform.ocd.aggregates.ListDoubleInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListDoubleAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listDouble: IndexedSeq[Double]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListDoubleInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListDoubleAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListDoubleAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListDoubleInAggregate.ListDoubleAggregate): this.type = {
    this.URI = result.URI;
    this._listDouble = result._listDouble;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListDoubleInAggregate.ListDoubleAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listDouble")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listDouble = {
    _listDouble
  }

  def listDouble_= (value: IndexedSeq[Double]) {
    _listDouble = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listDouble") listDouble: IndexedSeq[Double]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listDouble = if (listDouble == null) IndexedSeq.empty else listDouble)

}

object ListDoubleAggregate extends AggregateRootCompanion[ListDoubleAggregate]{

  def apply(
    listDouble: IndexedSeq[Double] = IndexedSeq[Double]()
  ) = {
    new ListDoubleAggregate(
      _locator = None
    , _URI = null
    , _listDouble = listDouble)
  }

}
