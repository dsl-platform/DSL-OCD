package com.dslplatform.ocd.aggregates.SetOptBoolInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetOptBoolAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setOptBool: Set[Option[Boolean]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetOptBoolInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetOptBoolAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetOptBoolAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetOptBoolInAggregate.SetOptBoolAggregate): this.type = {
    this.URI = result.URI;
    this._setOptBool = result._setOptBool;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetOptBoolInAggregate.SetOptBoolAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setOptBool")
  def setOptBool = {
    _setOptBool
  }

  def setOptBool_= (value: Set[Option[Boolean]]) {
    _setOptBool = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setOptBool") setOptBool: Set[Option[Boolean]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setOptBool = if (setOptBool == null) Set.empty else setOptBool)

}

object SetOptBoolAggregate extends AggregateRootCompanion[SetOptBoolAggregate]{

  def apply(
    setOptBool: Set[Option[Boolean]] = Set.empty
  ) = {
    new SetOptBoolAggregate(
      _locator = None
    , _URI = null
    , _setOptBool = setOptBool)
  }

}
