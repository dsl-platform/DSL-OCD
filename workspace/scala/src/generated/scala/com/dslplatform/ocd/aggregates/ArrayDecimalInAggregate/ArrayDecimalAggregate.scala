package com.dslplatform.ocd.aggregates.ArrayDecimalInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayDecimalAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayDecimal: Array[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayDecimalInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayDecimalAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayDecimalAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayDecimalInAggregate.ArrayDecimalAggregate): this.type = {
    this.URI = result.URI;
    this._arrayDecimal = result._arrayDecimal;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayDecimalInAggregate.ArrayDecimalAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayDecimal")
  def arrayDecimal = {
    _arrayDecimal
  }

  def arrayDecimal_= (value: Array[BigDecimal]) {
    _arrayDecimal = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayDecimal") arrayDecimal: Array[BigDecimal]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayDecimal = if (arrayDecimal == null) Array.empty else arrayDecimal)

}

object ArrayDecimalAggregate extends AggregateRootCompanion[ArrayDecimalAggregate]{

  def apply(
    arrayDecimal: Array[BigDecimal] = Array.empty
  ) = {
    new ArrayDecimalAggregate(
      _locator = None
    , _URI = null
    , _arrayDecimal = arrayDecimal)
  }

}
