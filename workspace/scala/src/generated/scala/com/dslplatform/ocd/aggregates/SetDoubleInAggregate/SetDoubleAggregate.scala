package com.dslplatform.ocd.aggregates.SetDoubleInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetDoubleAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setDouble: Set[Double]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetDoubleInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetDoubleAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetDoubleAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetDoubleInAggregate.SetDoubleAggregate): this.type = {
    this.URI = result.URI;
    this._setDouble = result._setDouble;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetDoubleInAggregate.SetDoubleAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setDouble")
  def setDouble = {
    _setDouble
  }

  def setDouble_= (value: Set[Double]) {
    _setDouble = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setDouble") setDouble: Set[Double]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setDouble = if (setDouble == null) Set.empty else setDouble)

}

object SetDoubleAggregate extends AggregateRootCompanion[SetDoubleAggregate]{

  def apply(
    setDouble: Set[Double] = Set.empty
  ) = {
    new SetDoubleAggregate(
      _locator = None
    , _URI = null
    , _setDouble = setDouble)
  }

}
