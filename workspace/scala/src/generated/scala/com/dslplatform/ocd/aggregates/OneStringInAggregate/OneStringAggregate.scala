package com.dslplatform.ocd.aggregates.OneStringInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class OneStringAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _oneString: String
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[OneStringInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneStringAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "OneStringAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.OneStringInAggregate.OneStringAggregate): this.type = {
    this.URI = result.URI;
    this._oneString = result._oneString;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.OneStringInAggregate.OneStringAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("oneString")
  def oneString = {
    _oneString
  }

  def oneString_= (value: String) {
    _oneString = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("oneString") oneString: String
  ) =
    this(_locator = Some(_locator), _URI = URI, _oneString = if (oneString == null) "" else oneString)

}

object OneStringAggregate extends AggregateRootCompanion[OneStringAggregate]{

  def apply(
    oneString: String = ""
  ) = {
    new OneStringAggregate(
      _locator = None
    , _URI = null
    , _oneString = oneString)
  }

}
