package com.dslplatform.ocd.aggregates.ListMoneyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListMoneyAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listMoney: IndexedSeq[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListMoneyInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListMoneyAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListMoneyAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListMoneyInAggregate.ListMoneyAggregate): this.type = {
    this.URI = result.URI;
    this._listMoney = result._listMoney;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListMoneyInAggregate.ListMoneyAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listMoney")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listMoney = {
    _listMoney
  }

  def listMoney_= (value: IndexedSeq[BigDecimal]) {
    _listMoney = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listMoney") listMoney: IndexedSeq[BigDecimal]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listMoney = if (listMoney == null) IndexedSeq.empty else listMoney)

}

object ListMoneyAggregate extends AggregateRootCompanion[ListMoneyAggregate]{

  def apply(
    listMoney: IndexedSeq[BigDecimal] = IndexedSeq[BigDecimal]()
  ) = {
    new ListMoneyAggregate(
      _locator = None
    , _URI = null
    , _listMoney = listMoney)
  }

}
