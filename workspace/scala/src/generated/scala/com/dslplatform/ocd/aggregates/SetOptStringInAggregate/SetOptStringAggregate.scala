package com.dslplatform.ocd.aggregates.SetOptStringInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetOptStringAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setOptString: Set[Option[String]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetOptStringInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetOptStringAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetOptStringAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetOptStringInAggregate.SetOptStringAggregate): this.type = {
    this.URI = result.URI;
    this._setOptString = result._setOptString;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetOptStringInAggregate.SetOptStringAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setOptString")
  def setOptString = {
    _setOptString
  }

  def setOptString_= (value: Set[Option[String]]) {
    _setOptString = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setOptString") setOptString: Set[Option[String]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setOptString = if (setOptString == null) Set.empty else setOptString)

}

object SetOptStringAggregate extends AggregateRootCompanion[SetOptStringAggregate]{

  def apply(
    setOptString: Set[Option[String]] = Set.empty
  ) = {
    new SetOptStringAggregate(
      _locator = None
    , _URI = null
    , _setOptString = setOptString)
  }

}
