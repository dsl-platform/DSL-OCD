package com.dslplatform.ocd.aggregates.OneDecimalInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneDecimalAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneDecimal: BigDecimal
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneDecimalInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneDecimalAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneDecimalAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneDecimalInAggregate.OneDecimalAggregate): this.type = {
    this.URI = result.URI;
    this._oneDecimal = result._oneDecimal;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneDecimalInAggregate.OneDecimalAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneDecimal")
  def oneDecimal = {
    _oneDecimal
  }

  def oneDecimal_= (value: BigDecimal) {
    _oneDecimal = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneDecimal") oneDecimal: BigDecimal
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneDecimal = if (oneDecimal == null) 0 else oneDecimal)

}

object OneDecimalAggregate extends AggregateRootCompanion[OneDecimalAggregate]{

  def apply(
    oneDecimal: BigDecimal = 0
  ) = {
    new OneDecimalAggregate(
      _locator = None
    , _URI = null
    , _oneDecimal = oneDecimal)
  }

}
