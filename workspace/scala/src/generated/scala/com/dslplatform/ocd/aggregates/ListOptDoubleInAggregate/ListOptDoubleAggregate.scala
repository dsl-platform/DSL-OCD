package com.dslplatform.ocd.aggregates.ListOptDoubleInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptDoubleAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptDouble: IndexedSeq[Option[Double]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptDoubleInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptDoubleAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptDoubleAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptDoubleInAggregate.ListOptDoubleAggregate): this.type = {
    this.URI = result.URI;
    this._listOptDouble = result._listOptDouble;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptDoubleInAggregate.ListOptDoubleAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptDouble")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptDouble = {
    _listOptDouble
  }

  def listOptDouble_= (value: IndexedSeq[Option[Double]]) {
    _listOptDouble = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptDouble") listOptDouble: IndexedSeq[Option[Double]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptDouble = if (listOptDouble == null) IndexedSeq.empty else listOptDouble)

}

object ListOptDoubleAggregate extends AggregateRootCompanion[ListOptDoubleAggregate]{

  def apply(
    listOptDouble: IndexedSeq[Option[Double]] = IndexedSeq[Option[Double]]()
  ) = {
    new ListOptDoubleAggregate(
      _locator = None
    , _URI = null
    , _listOptDouble = listOptDouble)
  }

}
