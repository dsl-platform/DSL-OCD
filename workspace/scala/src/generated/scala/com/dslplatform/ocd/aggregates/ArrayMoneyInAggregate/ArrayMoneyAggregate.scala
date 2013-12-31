package com.dslplatform.ocd.aggregates.ArrayMoneyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayMoneyAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayMoney: Array[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayMoneyInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayMoneyAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayMoneyAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayMoneyInAggregate.ArrayMoneyAggregate): this.type = {
    this.URI = result.URI;
    this._arrayMoney = result._arrayMoney;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayMoneyInAggregate.ArrayMoneyAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayMoney")
  def arrayMoney = {
    _arrayMoney
  }

  def arrayMoney_= (value: Array[BigDecimal]) {
    _arrayMoney = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayMoney") arrayMoney: Array[BigDecimal]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayMoney = if (arrayMoney == null) Array.empty else arrayMoney)

}

object ArrayMoneyAggregate extends AggregateRootCompanion[ArrayMoneyAggregate]{

  def apply(
    arrayMoney: Array[BigDecimal] = Array.empty
  ) = {
    new ArrayMoneyAggregate(
      _locator = None
    , _URI = null
    , _arrayMoney = arrayMoney)
  }

}
