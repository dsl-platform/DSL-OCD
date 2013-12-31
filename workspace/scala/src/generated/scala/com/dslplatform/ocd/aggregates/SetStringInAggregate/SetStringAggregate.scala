package com.dslplatform.ocd.aggregates.SetStringInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetStringAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setString: Set[String]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetStringInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetStringAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetStringAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetStringInAggregate.SetStringAggregate): this.type = {
    this.URI = result.URI;
    this._setString = result._setString;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetStringInAggregate.SetStringAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setString")
  def setString = {
    _setString
  }

  def setString_= (value: Set[String]) {
    _setString = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setString") setString: Set[String]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setString = if (setString == null) Set.empty else setString)

}

object SetStringAggregate extends AggregateRootCompanion[SetStringAggregate]{

  def apply(
    setString: Set[String] = Set.empty
  ) = {
    new SetStringAggregate(
      _locator = None
    , _URI = null
    , _setString = setString)
  }

}
