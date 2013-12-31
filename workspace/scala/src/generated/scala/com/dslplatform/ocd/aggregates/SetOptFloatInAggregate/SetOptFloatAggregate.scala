package com.dslplatform.ocd.aggregates.SetOptFloatInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetOptFloatAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setOptFloat: Set[Option[Float]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetOptFloatInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetOptFloatAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetOptFloatAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetOptFloatInAggregate.SetOptFloatAggregate): this.type = {
    this.URI = result.URI;
    this._setOptFloat = result._setOptFloat;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetOptFloatInAggregate.SetOptFloatAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setOptFloat")
  def setOptFloat = {
    _setOptFloat
  }

  def setOptFloat_= (value: Set[Option[Float]]) {
    _setOptFloat = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setOptFloat") setOptFloat: Set[Option[Float]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setOptFloat = if (setOptFloat == null) Set.empty else setOptFloat)

}

object SetOptFloatAggregate extends AggregateRootCompanion[SetOptFloatAggregate]{

  def apply(
    setOptFloat: Set[Option[Float]] = Set.empty
  ) = {
    new SetOptFloatAggregate(
      _locator = None
    , _URI = null
    , _setOptFloat = setOptFloat)
  }

}
