package com.dslplatform.ocd.aggregates.SetOptDecimalInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetOptDecimalAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setOptDecimal: Set[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetOptDecimalInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetOptDecimalAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetOptDecimalAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetOptDecimalInAggregate.SetOptDecimalAggregate): this.type = {
    this.URI = result.URI;
    this._setOptDecimal = result._setOptDecimal;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetOptDecimalInAggregate.SetOptDecimalAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setOptDecimal")
  def setOptDecimal = {
    _setOptDecimal
  }

  def setOptDecimal_= (value: Set[Option[BigDecimal]]) {
    _setOptDecimal = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setOptDecimal") setOptDecimal: Set[Option[BigDecimal]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setOptDecimal = if (setOptDecimal == null) Set.empty else setOptDecimal)

}

object SetOptDecimalAggregate extends AggregateRootCompanion[SetOptDecimalAggregate]{

  def apply(
    setOptDecimal: Set[Option[BigDecimal]] = Set.empty
  ) = {
    new SetOptDecimalAggregate(
      _locator = None
    , _URI = null
    , _setOptDecimal = setOptDecimal)
  }

}
