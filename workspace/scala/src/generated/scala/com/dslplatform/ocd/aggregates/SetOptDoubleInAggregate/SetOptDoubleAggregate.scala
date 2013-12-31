package com.dslplatform.ocd.aggregates.SetOptDoubleInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetOptDoubleAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setOptDouble: Set[Option[Double]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetOptDoubleInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetOptDoubleAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetOptDoubleAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetOptDoubleInAggregate.SetOptDoubleAggregate): this.type = {
    this.URI = result.URI;
    this._setOptDouble = result._setOptDouble;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetOptDoubleInAggregate.SetOptDoubleAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setOptDouble")
  def setOptDouble = {
    _setOptDouble
  }

  def setOptDouble_= (value: Set[Option[Double]]) {
    _setOptDouble = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setOptDouble") setOptDouble: Set[Option[Double]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setOptDouble = if (setOptDouble == null) Set.empty else setOptDouble)

}

object SetOptDoubleAggregate extends AggregateRootCompanion[SetOptDoubleAggregate]{

  def apply(
    setOptDouble: Set[Option[Double]] = Set.empty
  ) = {
    new SetOptDoubleAggregate(
      _locator = None
    , _URI = null
    , _setOptDouble = setOptDouble)
  }

}
