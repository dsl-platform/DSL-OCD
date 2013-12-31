package com.dslplatform.ocd.aggregates.OneMoneyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneMoneyAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneMoney: BigDecimal
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneMoneyInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneMoneyAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneMoneyAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneMoneyInAggregate.OneMoneyAggregate): this.type = {
    this.URI = result.URI;
    this._oneMoney = result._oneMoney;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneMoneyInAggregate.OneMoneyAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneMoney")
  def oneMoney = {
    _oneMoney
  }

  def oneMoney_= (value: BigDecimal) {
    _oneMoney = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneMoney") oneMoney: BigDecimal
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneMoney = if (oneMoney == null) BigDecimal(0) else oneMoney)

}

object OneMoneyAggregate extends AggregateRootCompanion[OneMoneyAggregate]{

  def apply(
    oneMoney: BigDecimal = BigDecimal(0)
  ) = {
    new OneMoneyAggregate(
      _locator = None
    , _URI = null
    , _oneMoney = oneMoney)
  }

}
