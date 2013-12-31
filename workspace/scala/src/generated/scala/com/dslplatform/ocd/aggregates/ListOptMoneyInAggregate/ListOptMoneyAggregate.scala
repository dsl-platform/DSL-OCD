package com.dslplatform.ocd.aggregates.ListOptMoneyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptMoneyAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptMoney: IndexedSeq[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptMoneyInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptMoneyAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptMoneyAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptMoneyInAggregate.ListOptMoneyAggregate): this.type = {
    this.URI = result.URI;
    this._listOptMoney = result._listOptMoney;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptMoneyInAggregate.ListOptMoneyAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptMoney")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptMoney = {
    _listOptMoney
  }

  def listOptMoney_= (value: IndexedSeq[Option[BigDecimal]]) {
    _listOptMoney = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptMoney") listOptMoney: IndexedSeq[Option[BigDecimal]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptMoney = if (listOptMoney == null) IndexedSeq.empty else listOptMoney)

}

object ListOptMoneyAggregate extends AggregateRootCompanion[ListOptMoneyAggregate]{

  def apply(
    listOptMoney: IndexedSeq[Option[BigDecimal]] = IndexedSeq[Option[BigDecimal]]()
  ) = {
    new ListOptMoneyAggregate(
      _locator = None
    , _URI = null
    , _listOptMoney = listOptMoney)
  }

}
