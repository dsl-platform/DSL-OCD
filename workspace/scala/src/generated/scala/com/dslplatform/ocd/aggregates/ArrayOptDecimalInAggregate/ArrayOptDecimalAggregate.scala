package com.dslplatform.ocd.aggregates.ArrayOptDecimalInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptDecimalAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptDecimal: Array[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptDecimalInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptDecimalAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptDecimalAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptDecimalInAggregate.ArrayOptDecimalAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptDecimal = result._arrayOptDecimal;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptDecimalInAggregate.ArrayOptDecimalAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptDecimal")
  def arrayOptDecimal = {
    _arrayOptDecimal
  }

  def arrayOptDecimal_= (value: Array[Option[BigDecimal]]) {
    _arrayOptDecimal = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptDecimal") arrayOptDecimal: Array[Option[BigDecimal]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptDecimal = if (arrayOptDecimal == null) Array.empty else arrayOptDecimal)

}

object ArrayOptDecimalAggregate extends AggregateRootCompanion[ArrayOptDecimalAggregate]{

  def apply(
    arrayOptDecimal: Array[Option[BigDecimal]] = Array.empty
  ) = {
    new ArrayOptDecimalAggregate(
      _locator = None
    , _URI = null
    , _arrayOptDecimal = arrayOptDecimal)
  }

}
