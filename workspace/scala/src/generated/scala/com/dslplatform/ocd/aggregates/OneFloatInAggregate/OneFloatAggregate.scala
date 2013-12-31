package com.dslplatform.ocd.aggregates.OneFloatInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneFloatAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneFloat: Float
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneFloatInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneFloatAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneFloatAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneFloatInAggregate.OneFloatAggregate): this.type = {
    this.URI = result.URI;
    this._oneFloat = result._oneFloat;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneFloatInAggregate.OneFloatAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneFloat")
  def oneFloat = {
    _oneFloat
  }

  def oneFloat_= (value: Float) {
    _oneFloat = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneFloat") oneFloat: Float
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneFloat = if (oneFloat == null) 0.0f else oneFloat)

}

object OneFloatAggregate extends AggregateRootCompanion[OneFloatAggregate]{

  def apply(
    oneFloat: Float = 0.0f
  ) = {
    new OneFloatAggregate(
      _locator = None
    , _URI = null
    , _oneFloat = oneFloat)
  }

}
