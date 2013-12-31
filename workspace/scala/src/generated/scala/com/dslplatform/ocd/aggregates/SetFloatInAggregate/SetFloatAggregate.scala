package com.dslplatform.ocd.aggregates.SetFloatInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetFloatAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setFloat: Set[Float]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetFloatInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetFloatAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetFloatAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetFloatInAggregate.SetFloatAggregate): this.type = {
    this.URI = result.URI;
    this._setFloat = result._setFloat;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetFloatInAggregate.SetFloatAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setFloat")
  def setFloat = {
    _setFloat
  }

  def setFloat_= (value: Set[Float]) {
    _setFloat = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setFloat") setFloat: Set[Float]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setFloat = if (setFloat == null) Set.empty else setFloat)

}

object SetFloatAggregate extends AggregateRootCompanion[SetFloatAggregate]{

  def apply(
    setFloat: Set[Float] = Set.empty
  ) = {
    new SetFloatAggregate(
      _locator = None
    , _URI = null
    , _setFloat = setFloat)
  }

}
