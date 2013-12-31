package com.dslplatform.ocd.aggregates.OneIntInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneIntAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneInt: Int
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneIntInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneIntAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneIntAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneIntInAggregate.OneIntAggregate): this.type = {
    this.URI = result.URI;
    this._oneInt = result._oneInt;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneIntInAggregate.OneIntAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneInt")
  def oneInt = {
    _oneInt
  }

  def oneInt_= (value: Int) {
    _oneInt = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneInt") oneInt: Int
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneInt = if (oneInt == null) 0 else oneInt)

}

object OneIntAggregate extends AggregateRootCompanion[OneIntAggregate]{

  def apply(
    oneInt: Int = 0
  ) = {
    new OneIntAggregate(
      _locator = None
    , _URI = null
    , _oneInt = oneInt)
  }

}
