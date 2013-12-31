package com.dslplatform.ocd.aggregates.OneDoubleInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneDoubleAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneDouble: Double
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneDoubleInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneDoubleAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneDoubleAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneDoubleInAggregate.OneDoubleAggregate): this.type = {
    this.URI = result.URI;
    this._oneDouble = result._oneDouble;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneDoubleInAggregate.OneDoubleAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneDouble")
  def oneDouble = {
    _oneDouble
  }

  def oneDouble_= (value: Double) {
    _oneDouble = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneDouble") oneDouble: Double
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneDouble = if (oneDouble == null) 0 else oneDouble)

}

object OneDoubleAggregate extends AggregateRootCompanion[OneDoubleAggregate]{

  def apply(
    oneDouble: Double = 0
  ) = {
    new OneDoubleAggregate(
      _locator = None
    , _URI = null
    , _oneDouble = oneDouble)
  }

}
