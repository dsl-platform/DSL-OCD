package com.dslplatform.ocd.aggregates.SetMoneyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetMoneyAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setMoney: Set[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetMoneyInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetMoneyAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetMoneyAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetMoneyInAggregate.SetMoneyAggregate): this.type = {
    this.URI = result.URI;
    this._setMoney = result._setMoney;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetMoneyInAggregate.SetMoneyAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setMoney")
  def setMoney = {
    _setMoney
  }

  def setMoney_= (value: Set[BigDecimal]) {
    _setMoney = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setMoney") setMoney: Set[BigDecimal]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setMoney = if (setMoney == null) Set.empty else setMoney)

}

object SetMoneyAggregate extends AggregateRootCompanion[SetMoneyAggregate]{

  def apply(
    setMoney: Set[BigDecimal] = Set.empty
  ) = {
    new SetMoneyAggregate(
      _locator = None
    , _URI = null
    , _setMoney = setMoney)
  }

}
