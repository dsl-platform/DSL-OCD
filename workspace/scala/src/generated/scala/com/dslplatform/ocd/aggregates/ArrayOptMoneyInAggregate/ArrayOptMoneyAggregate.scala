package com.dslplatform.ocd.aggregates.ArrayOptMoneyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptMoneyAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptMoney: Array[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptMoneyInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptMoneyAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptMoneyAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptMoneyInAggregate.ArrayOptMoneyAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptMoney = result._arrayOptMoney;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptMoneyInAggregate.ArrayOptMoneyAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptMoney")
  def arrayOptMoney = {
    _arrayOptMoney
  }

  def arrayOptMoney_= (value: Array[Option[BigDecimal]]) {
    _arrayOptMoney = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptMoney") arrayOptMoney: Array[Option[BigDecimal]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptMoney = if (arrayOptMoney == null) Array.empty else arrayOptMoney)

}

object ArrayOptMoneyAggregate extends AggregateRootCompanion[ArrayOptMoneyAggregate]{

  def apply(
    arrayOptMoney: Array[Option[BigDecimal]] = Array.empty
  ) = {
    new ArrayOptMoneyAggregate(
      _locator = None
    , _URI = null
    , _arrayOptMoney = arrayOptMoney)
  }

}
