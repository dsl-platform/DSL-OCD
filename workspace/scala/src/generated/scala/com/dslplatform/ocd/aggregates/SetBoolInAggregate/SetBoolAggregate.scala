package com.dslplatform.ocd.aggregates.SetBoolInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetBoolAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setBool: Set[Boolean]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetBoolInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetBoolAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetBoolAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetBoolInAggregate.SetBoolAggregate): this.type = {
    this.URI = result.URI;
    this._setBool = result._setBool;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetBoolInAggregate.SetBoolAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setBool")
  def setBool = {
    _setBool
  }

  def setBool_= (value: Set[Boolean]) {
    _setBool = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setBool") setBool: Set[Boolean]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setBool = if (setBool == null) Set.empty else setBool)

}

object SetBoolAggregate extends AggregateRootCompanion[SetBoolAggregate]{

  def apply(
    setBool: Set[Boolean] = Set.empty
  ) = {
    new SetBoolAggregate(
      _locator = None
    , _URI = null
    , _setBool = setBool)
  }

}
