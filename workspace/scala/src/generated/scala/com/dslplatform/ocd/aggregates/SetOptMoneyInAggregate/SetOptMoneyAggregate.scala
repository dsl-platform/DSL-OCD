package com.dslplatform.ocd.aggregates.SetOptMoneyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetOptMoneyAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setOptMoney: Set[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetOptMoneyInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetOptMoneyAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetOptMoneyAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetOptMoneyInAggregate.SetOptMoneyAggregate): this.type = {
    this.URI = result.URI;
    this._setOptMoney = result._setOptMoney;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetOptMoneyInAggregate.SetOptMoneyAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setOptMoney")
  def setOptMoney = {
    _setOptMoney
  }

  def setOptMoney_= (value: Set[Option[BigDecimal]]) {
    _setOptMoney = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setOptMoney") setOptMoney: Set[Option[BigDecimal]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setOptMoney = if (setOptMoney == null) Set.empty else setOptMoney)

}

object SetOptMoneyAggregate extends AggregateRootCompanion[SetOptMoneyAggregate]{

  def apply(
    setOptMoney: Set[Option[BigDecimal]] = Set.empty
  ) = {
    new SetOptMoneyAggregate(
      _locator = None
    , _URI = null
    , _setOptMoney = setOptMoney)
  }

}
